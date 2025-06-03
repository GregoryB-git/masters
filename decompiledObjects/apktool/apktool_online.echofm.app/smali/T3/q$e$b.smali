.class public LT3/q$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT3/q$e;->f(Le4/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:LT3/q$e;


# direct methods
.method public constructor <init>(LT3/q$e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/q$e$b;->p:LT3/q$e;

    .line 2
    .line 3
    iput-object p2, p0, LT3/q$e$b;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LT3/q$e$b;->p:LT3/q$e;

    .line 2
    .line 3
    iget-object v0, v0, LT3/q$e;->b:LT3/q;

    .line 4
    .line 5
    iget-object v1, p0, LT3/q$e$b;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1}, LT3/q;->f(LT3/q;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
