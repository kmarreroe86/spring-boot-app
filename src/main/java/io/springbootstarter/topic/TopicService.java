package io.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topis = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascirpt Description"));

	public List<Topic> getAllTopics() {
		return this.topis;
	}

	public Topic getTopicById(String id) {

		return this.topis.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
