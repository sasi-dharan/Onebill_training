package com.te.springcore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GirlFriend {
	private String name;
	private String phoneNumber;
	private BoyFriend boyFriend;
	
}
