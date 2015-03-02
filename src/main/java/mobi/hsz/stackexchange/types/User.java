package mobi.hsz.stackexchange.types;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class User extends ShallowUser {

    @SerializedName("account_id")
    protected int id;

    protected String aboutMe;
    protected int age;
    protected int answerCount;
    protected Date creationDate;
    protected int downVoteCount;
    protected boolean isEmployee;
    protected Date lastAccessDate;
    protected Date lastModifiedDate;
    protected String location;
    protected int questionCount;
    protected int reputationChangeDay;
    protected int reputationChangeMonth;
    protected int reputationChangeQuarter;
    protected int reputationChangeWeek;
    protected int reputationChangeYear;
    protected Date timedPenaltyDate;
    protected int upVoteCount;
    protected int viewCount;
    protected String websiteUrl;
    
    public List<Answer> getAnswers(){}
    public List<Question> getQuestions(){}
    public List<Answer> getVotedAnswers(voteType){}//voteType (PLUS,NEGATIVE,ALL)
    public List<Question> getVotedQuestions(voteType){}//voteType (PLUS,NEGATIVE,ALL)
    public List<Question> getStared(){}
    public int getScore(){}
    public void deleteAccount(){}
    public void setPassword(String newPassword){}
    
    
    

}
