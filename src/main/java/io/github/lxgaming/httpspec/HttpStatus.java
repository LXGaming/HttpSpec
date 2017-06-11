/*
 * Copyright 2017 Alex Thomson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.lxgaming.httpspec;

public enum HttpStatus {
	
	//https://github.com/joho/7XX-rfc
	
	//70X - Inexcusable
	MEH(701, "Meh"),
	EMACS(702, "Emacs"),
	EXPLOSION(703, "Explosion"),
	GOTO_FAIL(704, "Goto Fail"),
	I_WROTE_THE_CODE_AND_MISSED_THE_NECESSARY_VALIDATION_BY_AN_OVERSIGHT(705, "I wrote the code and missed the necessary validation by an oversight (see 795)"),
	DELETE_YOUR_ACCOUNT(706, "Delete Your Account"),
	CANT_QUIT_VI(707, "Can't quit vi"),
	
	//71X - Novelty Implementations
	PHP(710, "PHP"),
	CONVENIENCE_STORE(711, "Convenience Store"),
	NOSQL(712, "NoSQL"),
	I_AM_NOT_A_TEAPOT(718, "I am not a teapot"),
	HASKELL(719, "Haskell"),
	
	//72X - Edge Cases
	UNPOSSIBLE(720, "Unpossible"),
	KNOWN_UNKNOWNS(721, "Known Unknowns"),
	UNKNOWN_UNKNOWNS(722, "Unknown Unknowns"),
	TRICKY(723, "Tricky"),
	THIS_LINE_SHOULD_BE_UNREACHABLE(724, "This line should be unreachable"),
	IT_WORKS_ON_MY_MACHINE(725, "It works on my machine"),
	ITS_A_FEATURE_NOT_A_BUG(726, "It's a feature, not a bug"),
	THIRTY_TWO_BITS_IS_PLENTY(727, "32 bits is plenty"),
	GO_FISH(728, "Go Fish"),
	
	//73X - Fucking
	FUCKING_BOWER(730, "Fucking Bower"),
	FUCKING_RUBYGEMS(731, "Fucking Rubygems"),
	FUCKING_UNICODE(732, "Fucking Unic?de"),
	FUCKING_DEADLOCKS(733, "Fucking Deadlocks"),
	FUCKING_DEFERREDS(734, "Fucking Deferreds"),
	FUCKING_IE(735, "Fucking IE"),
	FUCKING_RACE_CONDITIONS(736, "Fucking Race Conditions"),
	FUCKTHREADSING(737, "FuckThreadsing"),
	FUCKING_BUNDLER(738, "Fucking Bundler"),
	FUCKING_WINDOWS(739, "Fucking Windows"),
	
	//74X - Meme Driven
	COMPUTER_SAYS_NO(740, "Computer says no"),
	COMPILING(741, "Compiling"),
	A_KITTEN_DIES(742, "A kitten dies"),
	I_THOUGHT_I_KNEW_REGULAR_EXPRESSIONS(743, "I thought I knew regular expressions"),
	Y_U_NO_WRITE_INTEGRATION_TESTS(744, "Y U NO write integration tests?"),
	I_DONT_ALWAYS_TEST_MY_CODE_BUT_WHEN_I_DO_I_DO_IT_IN_PRODUCTION(745, "I don't always test my code, but when I do I do it in production"),
	MISSED_BALLMER_PEAK(746, "Missed Ballmer Peak"),
	MOTHERFUCKING_SNAKES_ON_THE_MOTHERFUCKING_PLANE(747, "Motherfucking Snakes on the Motherfucking Plane"),
	CONFOUNDED_BY_PONIES(748, "Confounded by Ponies"),
	RESERVED_FOR_CHUCK_NORRIS(749, "Reserved for Chuck Norris"),
	
	//75X - Syntax Errors
	DIDNT_BOTHER_TO_COMPILE_IT(750, "Didn't bother to compile it"),
	SYNTAX_ERROR(753, "Syntax Error"),
	TOO_MANY_SEMI_COLONS(754, "Too many semi-colons"),
	NOT_ENOUGH_SEMI_COLONS(755, "Not enough semi-colons"),
	INSUFFICIENTLY_POLITE(756, "Insufficiently polite"),
	EXCESSIVELY_POLITE(757, "Excessively polite"),
	UNEXPECTED_T_PAAMAYIM_NEKUDOTAYIM(759, "Unexpected T_PAAMAYIM_NEKUDOTAYIM"),
	
	//76X - Substance-Affected Developer
	HUNGOVER(761, "Hungover"),
	STONED(762, "Stoned"),
	UNDER_CAFFEINATED(763, "Under-Caffeinated"),
	OVER_CAFFEINATED(764, "Over-Caffeinated"),
	RAILSCAMP(765, "Railscamp"),
	SOBER(766, "Sober"),
	DRUNK(767, "Drunk"),
	ACCIDENTALLY_TOOK_SLEEPING_PILLS_INSTEAD_OF_MIGRAINE_PILLS_DURING_CRUNCH_WEEK(768, "Accidentally Took Sleeping Pills Instead Of Migraine Pills During Crunch Week"),
	QUESTIONABLE_MATURITY_LEVEL(769, "Questionable Maturity Level"),
	
	//77X - Predictable Problems
	CACHED_FOR_TOO_LONG(771, "Cached for too long"),
	NOT_CACHED_LONG_ENOUGH(772, "Not cached long enough"),
	NOT_CACHED_AT_ALL(773, "Not cached at all"),
	WHY_WAS_THIS_CACHED(774, "Why was this cached?"),
	OUT_OF_CASH(775, "Out of cash"),
	ERROR_ON_THE_EXCEPTION(776, "Error on the Exception"),
	COINCIDENCE(777, "Coincidence"),
	OFF_BY_ONE_ERROR(778, "Off By One Error"),
	OFF_BY_TOO_MANY_TO_COUNT_ERROR(779, "Off By Too Many To Count Error"),
	
	//78X - Somebody Else's Problem
	PROJECT_OWNER_NOT_RESPONDING(780, "Project owner not responding"),
	OPERATIONS(781, "Operations"), QA(782, "QA"),
	IT_WAS_A_CUSTOMER_REQUEST_HONESTLY(783, "It was a customer request, honestly"),
	MANAGEMENT_OBVIOUSLY(784, "Management, obviously"),
	TPS_COVER_SHEET_NOT_ATTACHED(785, "TPS Cover Sheet not attached"),
	TRY_IT_NOW(786, "Try it now"),
	FURTHER_FUNDING_REQUIRED(787, "Further Funding Required"),
	DESIGNERS_FINAL_DESIGNS_WERENT(788, "Designer's final designs weren't"),
	NOT_MY_DEPARTMENT(789, "Not my department"),
	
	//79X - Internet crashed
	THE_INTERNET_SHUT_DOWN_DUE_TO_COPYRIGHT_RESTRICTIONS(791, "The Internet shut down due to copyright restrictions"),
	CLIMATE_CHANGE_DRIVEN_CATASTROPHIC_WEATHER_EVENT(792, "Climate change driven catastrophic weather event"),
	ZOMBIE_APOCALYPSE(793, "Zombie Apocalypse"),
	SOMEONE_LET_PG_NEAR_A_REPL(794, "Someone let PG near a REPL"),
	HEARTBLEED(795, "#heartbleed (see 705)"),
	THIS_IS_THE_LAST_PAGE_OF_THE_INTERNET_GO_BACK(797, "This is the last page of the Internet. Go back"),
	END_OF_THE_WORLD(799, "End of the world");
	
	private final int code;
	private final String reason;
	
	private HttpStatus(int code, String reason) {
		this.code = code;
		this.reason = reason;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getReason() {
		return reason;
	}
}