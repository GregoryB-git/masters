.class public final synthetic Lb8/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/e;


# instance fields
.field public synthetic a:Ld8/t;

.field public synthetic b:Ld8/t;

.field public synthetic c:Ld8/t;

.field public synthetic d:Ld8/t;

.field public synthetic e:Ld8/t;


# direct methods
.method public synthetic constructor <init>(Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/q0;->a:Ld8/t;

    iput-object p2, p0, Lb8/q0;->b:Ld8/t;

    iput-object p3, p0, Lb8/q0;->c:Ld8/t;

    iput-object p4, p0, Lb8/q0;->d:Ld8/t;

    iput-object p5, p0, Lb8/q0;->e:Ld8/t;

    return-void
.end method


# virtual methods
.method public final g(Ld8/u;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lb8/q0;->a:Ld8/t;

    iget-object v1, p0, Lb8/q0;->b:Ld8/t;

    iget-object v2, p0, Lb8/q0;->c:Ld8/t;

    iget-object v3, p0, Lb8/q0;->d:Ld8/t;

    iget-object v4, p0, Lb8/q0;->e:Ld8/t;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/t;Ld8/c;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    return-object p1
.end method
