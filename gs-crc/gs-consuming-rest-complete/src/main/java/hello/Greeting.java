package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

  /** Autogenerada **/
    private  long id;
    private  String content;

    
    /**
     * @param id
     */
    public void setId (long id) {
      this.id = id;
    }
    
    /**
     * @param content
     */
    public void setContent (String content) {
      this.content = content;
    }
    /**
     * 
     */
    public Greeting() {
  }
    /**
     * @param id
     * @param content
     */
    public Greeting(long id, String content) {
      this.id = id;
      this.content = content;
  }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
