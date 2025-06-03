.class public final synthetic Ll5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/ryanheise/audioservice/a$c;

.field public final synthetic p:Ljava/util/Map;

.field public final synthetic q:LE5/k$d;


# direct methods
.method public synthetic constructor <init>(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/j;->o:Lcom/ryanheise/audioservice/a$c;

    .line 5
    .line 6
    iput-object p2, p0, Ll5/j;->p:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, Ll5/j;->q:LE5/k$d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll5/j;->o:Lcom/ryanheise/audioservice/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Ll5/j;->p:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v2, p0, Ll5/j;->q:LE5/k$d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/ryanheise/audioservice/a$c;->a(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
