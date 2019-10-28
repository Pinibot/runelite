/*
 * Copyright (c) 2019, Pinibot <https://github.com/Pinibot>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.zeahrunecraft;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Varbits;

@AllArgsConstructor
@Getter
public enum DenseRunestoneInfo
{
	NORTH(8981, Varbits.DENSE_RUNESTONE_NORTH_DEPLETED),
	SOUTH(10796, Varbits.DENSE_RUNESTONE_SOUTH_DEPLETED);

	private final int gameObjectId;
	private final Varbits depletionVarbit;

	public static Optional<DenseRunestoneInfo> findDenseRunestoneInfo(final int gameObjectId)
	{

		for (DenseRunestoneInfo runestoneInfo : DenseRunestoneInfo.values())
		{
			if (runestoneInfo.getGameObjectId() == gameObjectId)
			{
				return Optional.of(runestoneInfo);
			}
		}

		return Optional.empty();
	}
}
