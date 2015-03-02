package mobi.hsz.stackexchange.types;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Question {

  public List<Answer> getAnswers(){}
  public Answer getAccepted(){}
  public boolean hasAccepted(){}
  public List<Comment> getComments(){}
  public int getScore(){}
  public void addUpVote(){}
  public void removeUpVote(){}
  public void addDownVote(){}
  public void removeDownVote(){}


}
