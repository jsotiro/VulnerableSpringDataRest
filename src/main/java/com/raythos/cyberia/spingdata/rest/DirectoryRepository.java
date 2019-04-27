package com.raythos.cyberia.spingdata.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Api(tags = "Employee Location")
@RepositoryRestResource(path = "employees")

@ApiOperation("find the location for a given employee")
public interface DirectoryRepository extends PagingAndSortingRepository<EmployeeLocation, Long> {


    @ApiOperation("find the location for a given employee")
    List<EmployeeLocation> findByName(@Param("name") String name);

    @Override
    @SuppressWarnings("unchecked")
    @ApiOperation("saves a new employee location")
    @ApiResponses({@ApiResponse(code = 201, message = "Created", response = EmployeeLocation.class)})
    EmployeeLocation  save(EmployeeLocation employeeLocation);

}
