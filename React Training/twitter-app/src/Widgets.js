import React from "react";
import "./Widgets.css";
import {
  TwitterTimelineEmbed,
  TwitterShareButton,
  TwitterTweetEmbed,
} from "react-twitter-embed";
import SearchIcon from "@material-ui/icons/Search";

function Widgets() {
  return (
    <div className="widgets">
      <div className="widgets__input">
        <SearchIcon className="widgets__searchIcon" />
        <input placeholder="Search Twitter" type="text" />
      </div>

      <div className="widgets__widgetContainer">
        <h2>What's happening...?</h2>

        <TwitterTweetEmbed tweetId={"1482968441862909954"} />

        <TwitterTimelineEmbed
          sourceType="profile"
          screenName="wasimbasha1865"
          options={{ height: 400 }}
        />

        <TwitterShareButton
          url={""}
          options={{ text: "#reactjs is easy to learn", via: "wasimbasha1865" }}
        />
      </div>
    </div>
  );
}

export default Widgets;