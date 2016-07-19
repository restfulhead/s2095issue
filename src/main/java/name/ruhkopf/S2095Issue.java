package name.ruhkopf;

import java.io.IOException;
import java.io.InputStream;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

public class S2095Issue
{
	public void readStream1(final InputStream input)
	{
		Preconditions.checkNotNull(input);

		try (InputStream is = input)
		{
			// TODO do something with stream
		}
		catch (final IOException e)
		{
			throw Throwables.propagate(e);
		}
	}

	public void readStream2(final InputStream input)
	{

		try (InputStream is = input)
		{
			Preconditions.checkNotNull(is);

			// TODO do something with stream
		}
		catch (final IOException e)
		{
			throw Throwables.propagate(e);
		}
	}

}
