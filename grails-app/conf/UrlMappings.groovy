class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller:"flavorwocky")
		"500"(view:'/error')
        "/ping" (controller: "flavorwocky", action:"ping")
        "/autosearch" (controller: "flavorwocky", action:"autosearch")
	}
}
