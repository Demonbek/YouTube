package ru.demonapps.youtube.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.youtube.player.YouTubeThumbnailView;
import ru.demonapps.youtube.R;

/**
 * Created by sonu on 10/11/17.
 */

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    public YouTubeThumbnailView videoThumbnailImageView;
    public TextView videoTitle, videoDuration;

    public YoutubeViewHolder(View itemView) {
        super(itemView);
        videoThumbnailImageView = itemView.findViewById(R.id.video_thumbnail_image_view);
        videoTitle = itemView.findViewById(R.id.video_title_label);
        videoDuration = itemView.findViewById(R.id.video_duration_label);
    }
}
