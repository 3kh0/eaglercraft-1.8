
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 5

~ 

> CHANGE  15 : 16  @  16 : 18

~ 	public static PropertyEnum<BlockRedSandstone.EnumType> TYPE;

> INSERT  23 : 27  @  25

+ 	public static void bootstrapStates() {
+ 		TYPE = PropertyEnum.<BlockRedSandstone.EnumType>create("type", BlockRedSandstone.EnumType.class);
+ 	}
+ 

> EOF