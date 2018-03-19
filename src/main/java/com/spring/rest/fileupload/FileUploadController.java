package com.spring.rest.fileupload;

import java.io.IOException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.google.common.net.HttpHeaders;

@RestController
public class FileUploadController {
	
	@Autowired
	private StorageService storageService;
	
	@RequestMapping(value="upload", method=RequestMethod.GET)
	public ModelAndView upload(){
		return new ModelAndView("upload");
	}
	@Autowired
	public FileUploadController(StorageService storageService){
		this.storageService = storageService;
	}
	
	@GetMapping("/")
	public String listUploadedFiles(Model model) throws IOException{
		
		Model listModel= model.addAttribute("files", storageService.loadAll().map(path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serveFile", path.getFileName().toString()).build().toString()).collect(Collectors.toList()));
		
		return "UploadForm";
	}
	
	@GetMapping("/files/{filename:>+}")
	public ResponseEntity<Resource> serveFile(@PathVariable String filename){
		
		Resource file =  storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+ file.getFilename()+ "\"").body(file);
		
	}
	

}
