package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signerId;
    private int replyOwnerId;
    private int replyPostId;
    private int postponedId;
    private boolean friendsOnly;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Copyright copyright;
    private String[] postType;
    private Geo geo;
    private ActionsInfo actionsInfo;
    private String name;
    private String text;
    private boolean image;
    private CommentsInfo commentsInfo;
    private Likes likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;


}
