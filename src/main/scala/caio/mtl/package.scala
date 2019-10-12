package caio

package object mtl {

  type Provided[MP[_], M[_], E] =
    Provides[M, E]{ type FE[A] = MP[A]}

  type Extended[FP[_], F[_], E1, E2] =
    Extends[F, E1, E2]{ type FE[A] = FP[A]}

  type Asked[FP[_], F[_], E] =
    Askable[F, E]{ type FE[A] = FP[A]}

  type WriterTransform[FP[_], F[_], L] =
    ContextWriterTransformers[F, L]{ type FE[A] = FP[A]}
}
