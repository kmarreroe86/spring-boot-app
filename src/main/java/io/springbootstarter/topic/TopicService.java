package io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		// this.topicRepository.findAll().forEach(t -> topics.add(t));
		this.topicRepository.findAll().forEach(topics::add);

		return topics;
	}

	public Topic getTopicById(String id) {

		return this.topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {

		this.topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {

		/**
		 * If found do an update, insert otherwise, so we need to check for
		 * exist first
		 **/
		this.topicRepository.save(topic);

	}

	public void deleteTopicByIdd(String id) {

		this.topicRepository.delete(id);
	}

}
