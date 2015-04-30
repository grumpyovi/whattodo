package com.grumpy.whattodo.utility;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;

import org.springframework.web.client.HttpClientErrorException;


public class ErrorHandler
{

	public static void handleResponseStatusCode(final HttpClientErrorException clientError)
	{
		switch (clientError.getStatusCode().value())
		{
			case 400:
				throw new BadRequestException();
			case 401:
				// TODO: Exception for UnAuthorized
				throw new InternalServerErrorException();
			case 403:
				throw new ForbiddenException();
			case 404:
				throw new NotFoundException();
			case 409:
				throw new BadRequestException("User already voted");
		}
	}

}
