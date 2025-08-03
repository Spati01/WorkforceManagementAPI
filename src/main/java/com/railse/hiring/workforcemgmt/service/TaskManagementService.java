package com.railse.hiring.workforcemgmt.service;



import com.railse.hiring.workforcemgmt.dto.*;
import com.railse.hiring.workforcemgmt.model.enums.Priority;


import java.util.List;


public interface TaskManagementService {
    List<TaskManagementDto> createTasks(TaskCreateRequest request);
    List<TaskManagementDto> updateTasks(UpdateTaskRequest request);
    String assignByReference(AssignByReferenceRequest request);
    List<TaskManagementDto> fetchTasksByDate(TaskFetchByDateRequest request);
    TaskManagementDto findTaskById(Long id);


    //  Feature 2: Priority update + fetch by priority
    TaskManagementDto updatePriority(Long taskId, Priority newPriority);
    List<TaskManagementDto> getTasksByPriority(Priority priority);

    //  Feature 3: Comments
    TaskManagementDto addComment(Long taskId, String comment);
}


