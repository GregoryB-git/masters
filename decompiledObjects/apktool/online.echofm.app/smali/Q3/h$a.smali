.class public LQ3/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/h;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LQ3/h;


# direct methods
.method public constructor <init>(LQ3/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/h$a;->o:LQ3/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/h$a;->o:LQ3/h;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/h;->a(LQ3/h;)LV3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LV3/m;->a0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
