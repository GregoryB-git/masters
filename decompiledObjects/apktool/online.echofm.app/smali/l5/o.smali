.class public final synthetic Ll5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LE5/k$d;

.field public final synthetic p:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(LE5/k$d;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/o;->o:LE5/k$d;

    .line 5
    .line 6
    iput-object p2, p0, Ll5/o;->p:Ljava/lang/Exception;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/o;->o:LE5/k$d;

    .line 2
    .line 3
    iget-object v1, p0, Ll5/o;->p:Ljava/lang/Exception;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a$c;->M(LE5/k$d;Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
