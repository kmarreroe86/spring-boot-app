package io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("javascript", "Javascript", "Javascirpt Description")));

	public List<Topic> getAllTopics() {

		return this.topics;
	}

	public Topic getTopicById(String id) {

		return this.topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

		this.topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < this.topics.size(); i++) {
			if (!this.topics.get(i).getId().equalsIgnoreCase(id))
				continue;

			this.topics.set(i, topic);
			return;
		}
	}

	public void deleteTopicByIdd(String id) {

		this.topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
	}

}
