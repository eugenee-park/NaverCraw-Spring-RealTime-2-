package com.cos.news.domain;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;

import reactor.core.publisher.Flux;

public interface NewsRepository extends ReactiveMongoRepository<News, String>{

	//db.runCommand({convertToCapped:'naver_realtime', size:8192});
	@Tailable
	@Query(value = "{}")
	Flux<News> mFindAll();
}
