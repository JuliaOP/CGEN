package br.unesp.rc.cgengenerator.controller.command;

import br.unesp.rc.cgengenerator.controller.servlet.HttpServletResponse;

public interface ICommand {

	public String execute(HttpServletRequest request, HttpServletResponse response);

}
