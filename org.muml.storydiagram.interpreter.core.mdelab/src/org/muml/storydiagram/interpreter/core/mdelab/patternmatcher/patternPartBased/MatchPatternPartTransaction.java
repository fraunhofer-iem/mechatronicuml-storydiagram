package org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased;

import java.util.Set;

public class MatchPatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression> extends
		PatternPartTransaction<StoryPatternObject, StoryPatternLink, Classifier, Expression>
{

	public MatchPatternPartTransaction(PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression> patternPart,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> uncheckedPatternParts,
			Set<PatternPart<StoryPatternObject, StoryPatternLink, Classifier, Expression>> checkedPatternParts)
	{
		super(patternPart, uncheckedPatternParts, checkedPatternParts);
	}

}
