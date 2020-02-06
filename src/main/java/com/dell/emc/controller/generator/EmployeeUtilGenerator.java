package com.dell.emc.controller.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dell.emc.model.Employee;
import com.dell.emc.model.EmployeeDTO;

public class EmployeeUtilGenerator {

	public static Employee mapDTOToEntity(EmployeeDTO employeeDTO) {

		Employee employee = null;

		if (employeeDTO != null) {
			employee = new Employee();
			employee.setFirstname(employeeDTO.getFirstname());
			employee.setLastname(employeeDTO.getLastname());
			employee.setDesignation(employeeDTO.getDesignation());
			employee.setAddress(employeeDTO.getAddress());
			employee.setSalary(employeeDTO.getSalary());
		}

		return employee;
	}

	public static EmployeeDTO convertEntityToDto(Optional<Employee> emp) {
		EmployeeDTO employeeDTO = null;

		if (null != emp) {

			employeeDTO = new EmployeeDTO();
			employeeDTO.setFirstname(emp.get().getFirstname());
			employeeDTO.setLastname(emp.get().getLastname());
			employeeDTO.setDesignation(emp.get().getDesignation());
		}

		return employeeDTO;
	}

	public static List<EmployeeDTO> mapEntityToDTO(List<Employee> employees) {
		
		List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
		if (null != employees) {
			EmployeeDTO employeeDTO = null;
			

			for (Employee emp : employees) {

				employeeDTO = new EmployeeDTO();
				employeeDTO.setFirstname(emp.getFirstname());
				employeeDTO.setLastname(emp.getLastname());
				employeeDTO.setDesignation(emp.getDesignation());

				empList.add(employeeDTO);
			}
		}
		return empList;
	}
}
