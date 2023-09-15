package br.edu.fateccotia.tasklist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fateccotia.tasklist.enums.TaskStatus;
import br.edu.fateccotia.tasklist.model.Task;
import br.edu.fateccotia.tasklist.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping
	public ResponseEntity<?> find() {
		return ResponseEntity.ok("Hello World");
	}
	
	@GetMapping("/all")
	public ResponseEntity< List< Task>> findAll() {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task(1, "Atividade 1",TaskStatus.PENDING));
		list.add(new Task(2, "Atividade 2",TaskStatus.PENDING));
		list.add(new Task(3, "Atividade 3",TaskStatus.PENDING));
		
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/createTask")
	public ResponseEntity<Task> create(@RequestBody Task task) {
		Task taskCreated = taskService.save(task);	
		return ResponseEntity.ok(taskCreated);
	};
}
