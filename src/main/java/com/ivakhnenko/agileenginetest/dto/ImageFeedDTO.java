package com.ivakhnenko.agileenginetest.dto;

import java.util.List;

public class ImageFeedDTO {
    private List<ImageDTO> pictures;
    private Long page;
    private Long pageCount;
    private boolean hasMore;

    public List<ImageDTO> getPictures() {
        return pictures;
    }

    public void setPictures(List<ImageDTO> pictures) {
        this.pictures = pictures;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}
