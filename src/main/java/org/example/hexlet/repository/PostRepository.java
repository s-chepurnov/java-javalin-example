package org.example.hexlet.repository;

import java.util.ArrayList;
import java.util.List;

import org.example.hexlet.model.Post;

public class PostRepository {
    private static List<Post> entities = new ArrayList<Post>();

    public static void save(Post post) {
        post.setId((long) entities.size() + 1);
        entities.add(post);
    }

    // public static List<Post> search(String term) {
    //     var posts = entities.stream()
    //             .filter(entity -> entity.getName().startsWith(term))
    //             .toList();
    //     return posts;
    // }

    public static Post find(Long id) {
        var post = entities.stream()
                .filter(entity -> entity.getId() == id)
                .findAny()
                .orElse(null);
        return post;
    }

    public static List<Post> getEntities() {
        return entities;
    }

    public static void delete(Long id) {

    }
}

