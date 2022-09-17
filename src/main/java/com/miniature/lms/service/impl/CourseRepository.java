package com.miniature.lms.service.impl;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.miniature.lms.service.api.CourseVO;

@Repository
public interface CourseRepository extends CassandraRepository<CourseVO, UUID> {
}
