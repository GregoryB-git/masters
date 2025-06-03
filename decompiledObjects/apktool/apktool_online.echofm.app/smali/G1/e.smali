.class public final synthetic LG1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LG1/e;->o:J

    .line 5
    .line 6
    iput-object p3, p0, LG1/e;->p:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-wide v0, p0, LG1/e;->o:J

    .line 2
    .line 3
    iget-object v2, p0, LG1/e;->p:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, LG1/f;->b(JLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
