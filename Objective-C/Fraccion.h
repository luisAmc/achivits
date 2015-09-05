#import <Foundation/NSObject.h>
@interface Fraccion: NSObject{
		double numerador;
		double denominador;
		double valor;
	}
	-(Fraccion*) initFraccion: (double) n denominador: (double) d;
	-(void) setNumerador: (double) d;
	-(void) setDenominador: (double) d;
	-(void) setNumerador: (double) n and Denominador: (double) d;
	-(void) setValor: (double) v;
	-(void) print;
	-(double) numerador;
	-(double) denominador;
	-(double) valor;
@end