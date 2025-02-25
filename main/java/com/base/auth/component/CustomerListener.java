package com.base.auth.component;

import com.base.auth.constant.UserBaseConstant;
import com.base.auth.exception.NotFoundException;
import com.base.auth.model.Customer;
import com.base.auth.model.Group;
import com.base.auth.repository.GroupRepository;
import javax.persistence.PrePersist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {
  @Autowired
  private GroupRepository groupRepository;

  @PrePersist
  public void prePersist(Customer customer){
    if (customer.getAccount() != null && customer.getAccount().getGroup() == null){
      Group customerGroup = groupRepository.findByKind(UserBaseConstant.GROUP_KIND_CUSTOMER).orElseThrow(()
      -> new NotFoundException("Customer group not found"));
      customer.getAccount().setGroup(customerGroup);
    }
  }
}
