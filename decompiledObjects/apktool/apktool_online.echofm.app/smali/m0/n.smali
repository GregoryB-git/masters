.class public final synthetic Lm0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lm0/x$a;

.field public final synthetic p:Lm0/z$a;


# direct methods
.method public synthetic constructor <init>(Lm0/x$a;Lm0/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/n;->o:Lm0/x$a;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/n;->p:Lm0/z$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/n;->o:Lm0/x$a;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/n;->p:Lm0/z$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lm0/x$a;->f(Lm0/x$a;Lm0/z$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
