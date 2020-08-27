package org.eclipse.emf.eson.example.generator

import org.eclipse.emf.eson.example.library.Library

class Template {
    
    def generate(Library library) '''
        «library.name»
        ====
        
        «FOR book : library.books»
        	* «book.name»
        «ENDFOR»
    '''
    
}