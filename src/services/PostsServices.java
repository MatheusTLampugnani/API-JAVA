package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import interfaces.IPostService;
import model.Post;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// import com.google.gson.Gson;
// import com.google.gson.reflect.TypeToken;

public class PostsServices implements IPostService {
  private final gson gson = new gson();

  public List<Post> getPosts() {
    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
          response.append(line);
        }

        Type listType = new TypeToken<ArrayList<Post>>() {

          public Type getType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'Post'");
          }
        }.getType();
        return gson.fromJson(response.toString(), listType);

      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return new ArrayList<>();
  }

  public Post getPostById(Integer id) {
    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
          response.append(line);
        }

        Type listType = new TypeToken<Post>() {

          public Type getType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("method 'By ID'");
          }
        }.getType();
        return (Post) gson.fromJson(response.toString(), listType);

      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  public Post createPost(Post post) {
    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
          response.append(line);
        }

        Type listType = new TypeToken<Post>() {

          public Type getType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("method 'Creat'");
          }
        }.getType();
        return (Post) gson.fromJson(response.toString(), listType);

      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  public Post updatePost(Post post) {
    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
          response.append(line);
        }

        Type listType = new TypeToken<Post>() {

          public Type getType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("method 'Update'");
          }
        }.getType();
        return (Post) gson.fromJson(response.toString(), listType);

      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  public void deletePost(Integer id) {
    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
          response.append(line);
        }

        Type listType = new TypeToken<Post>() {

          public Type getType() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("method 'Delete'");
          }
        }.getType();
        return;

      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return;
  }

}
