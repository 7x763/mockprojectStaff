package com.mock_project_102024_nhom02.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class ComplaintsRequest  {
    String user;

    LocalDate complaintDate;

    LocalDate expectedCompletionDate;

    String apartment;

    String contentOfComplaint;

    String proofImg;

    String staff;

    String note;

    String status;
}
