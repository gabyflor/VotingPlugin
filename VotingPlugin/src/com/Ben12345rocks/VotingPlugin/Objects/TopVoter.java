package com.Ben12345rocks.VotingPlugin.Objects;

import java.util.ArrayList;

import com.Ben12345rocks.VotingPlugin.Config.Config;

public enum TopVoter {
	AllTime, Monthly, Weekly, Daily;

	public static TopVoter getDefault() {
		TopVoter top = getTopVoter(Config.getInstance().getVoteTopDefault());
		if (top != null) {
			return top;
		}
		return AllTime;
	}

	public static TopVoter getTopVoter(String str) {
		for (TopVoter value : values()) {
			if (value.toString().equalsIgnoreCase(str)) {
				return value;
			}
		}
		return AllTime;
	}

	public TopVoter next() {
		ArrayList<TopVoter> list = new ArrayList<TopVoter>();
		if (Config.getInstance().getLoadTopVoterAllTime()) {
			list.add(TopVoter.AllTime);
		}
		if (Config.getInstance().getLoadTopVoterMonthly()) {
			list.add(TopVoter.Monthly);
		}
		if (Config.getInstance().getLoadTopVoterWeekly()) {
			list.add(TopVoter.Weekly);
		}
		if (Config.getInstance().getLoadTopVoterDaily()) {
			list.add(TopVoter.Daily);
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(this)) {
				int next = i + 1;
				if (next > list.size() - 1) {
					next = 0;
				}
				return TopVoter.values()[next];
			}
		}
		return TopVoter.AllTime;
	}

	public TopVoter prev() {
		switch (this) {
		case AllTime:
			return Daily;
		case Daily:
			return Weekly;
		case Monthly:
			return AllTime;
		case Weekly:
			return Monthly;
		default:
			return AllTime;

		}

	}
}
