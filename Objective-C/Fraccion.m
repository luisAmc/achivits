#import "Fraccion.h"
#import <stdio.h>
@implementation Fraccion
	-(Fraccion*) initFraccion: (double) n denominador: (double) d {
		self = [super init];
		if ( self ) {
			[self setNumerador: n andDenominador: d];
			[self setValor: (n/d)];
		}
		return self;
	}
	-(void) print {
		printf( "%lf/%lf=%lf%s", numerador, denominador,value,"\n" );
	}
	-(void) setNumerador: (double) n {
		numerador = n;
	}
	-(void) setDenominador: (double) d {
		denominador = d;
	}
	-(void) setNumerador: (double) n and Denominador: (double) d {
		numerador = n;
		denominador = d;
	}
	-(void) setValor: (double) v {
		value = v;
	}
	-(double) denominador {
		return denominador;
	}
	-(double) numerador {
		return numerador;
	}
	-(double) value {
		return value;
	}
@end