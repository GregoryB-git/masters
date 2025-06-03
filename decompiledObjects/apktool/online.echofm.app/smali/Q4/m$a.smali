.class public LQ4/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:LP4/c;

.field public final synthetic b:LQ4/m;


# direct methods
.method public constructor <init>(LQ4/m;LP4/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ4/m$a;->b:LQ4/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LQ4/m$a;->a:LP4/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ4/m$a;->b:LQ4/m;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/m$a;->a:LP4/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, LQ4/m;->a(LQ4/m;LP4/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
