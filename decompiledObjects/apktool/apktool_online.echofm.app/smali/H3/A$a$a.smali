.class public LH3/A$a$a;
.super LH3/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/A$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/lang/Runnable;

.field public final synthetic p:LH3/A$a;


# direct methods
.method public constructor <init>(LH3/A$a;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/A$a$a;->p:LH3/A$a;

    .line 2
    .line 3
    iput-object p2, p0, LH3/A$a$a;->o:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, LH3/d;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LH3/A$a$a;->o:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
