package com.base.auth.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShowPageResults<T> {
  private List<T> content;
  private long totalElements;
  private int totalPages;
}
