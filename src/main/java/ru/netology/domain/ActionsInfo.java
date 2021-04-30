package ru.netology.domain;


public class ActionsInfo {
    private boolean canComplain;
    private boolean canSaveToBookmarks;

    public boolean isCanComplain(){return canComplain;}

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;}

    public ActionsInfo(boolean canSaveToBookmarks) {
        this.canSaveToBookmarks = canSaveToBookmarks;}
}
