.class public final synthetic Ln5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ln5/s;

.field public final synthetic p:Ln5/o;


# direct methods
.method public synthetic constructor <init>(Ln5/s;Ln5/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/r;->o:Ln5/s;

    .line 5
    .line 6
    iput-object p2, p0, Ln5/r;->p:Ln5/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/r;->o:Ln5/s;

    .line 2
    .line 3
    iget-object v1, p0, Ln5/r;->p:Ln5/o;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ln5/s;->d(Ln5/s;Ln5/o;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
