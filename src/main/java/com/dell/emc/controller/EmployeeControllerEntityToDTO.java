/*package com.dell.emc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dell.emc.controller.generator.EmployeeUtilGenerator;
import com.dell.emc.model.Employee;
import com.dell.emc.model.EmployeeDTO;
import com.dell.emc.service.EmployeeService;

//@RestController -> @Service -> @Repository ->  EntityManager, Domain model
@RestController
@RequestMapping("/employee")
public class EmployeeControllerEntityToDTO {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeControllerEntityToDTO.class);

	@Autowired
	EmployeeService empService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	public String addEmployee(@RequestBody EmployeeDTO employeeDTO) {
		//
		logger.info("Entering into addEmployee service");

		// Convert DTO to Entity to persist data
		Employee employee = EmployeeUtilGenerator.mapDTOToEntity(employeeDTO);

		empService.save(employee);

		if (logger.isDebugEnabled()) {
			logger.debug("Employee added successfully : " + employee);
		}
		logger.info("Exiting from addEmployee service");
		return "Employee added successfully ";
	}

	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public EmployeeDTO getEmployee(@PathVariable("id") Long id) {

		Optional<Employee> employee = empService.getById(id);
		// OR
		// Employee employee = empService.loadOne(id);

		if (!employee.isPresent()) {
			logger.debug("Employee with id " + id + " does not exists");
		}

		logger.debug("Found Employee : " + employee);
		//Converting Entity to DTO 
		EmployeeDTO dto = EmployeeUtilGenerator.convertEntityToDto(employee);
		return dto;
	}

	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> employees = empService.getAll();
		if (employees.isEmpty()) {
			logger.debug("Employee(s) does not exists");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Number of Employees found : " + employees.size() + " ");
			logger.debug(Arrays.toString(employees.toArray()));
		}
		// convert Entity into DTO
		List<EmployeeDTO> empDTOsList = EmployeeUtilGenerator.mapEntityToDTO(employees);
		
		return empDTOsList;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {

		logger.info("Entering into updateEmployee service");

		Optional<Employee> existingEmp = empService.getById(employee.getId());

		if (!existingEmp.isPresent()) {
			logger.debug("Employee with id " + employee.getId() + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empService.save(employee);
			logger.info("Exiting from updateEmployee service");
			return new ResponseEntity<Void>(HttpStatus.OK);
		}

	}

	

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
		Optional<Employee> employee = empService.getById(id);
		if (!employee.isPresent()) {
			logger.debug("Employee with id " + id + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empService.delete(id);
			logger.debug("Employee with id " + id + " deleted");
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}
}
*/
