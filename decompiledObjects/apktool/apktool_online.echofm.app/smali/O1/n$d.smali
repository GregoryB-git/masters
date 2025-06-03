.class public final LO1/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/n;->a(LO1/n$b;LO1/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:LO1/n$a;

.field public final synthetic b:LO1/n$b;


# direct methods
.method public constructor <init>(LO1/n$a;LO1/n$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO1/n$d;->a:LO1/n$a;

    .line 2
    .line 3
    iput-object p2, p0, LO1/n$d;->b:LO1/n$b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LO1/n$d;->a:LO1/n$a;

    .line 2
    .line 3
    sget-object v1, LO1/n;->a:LO1/n;

    .line 4
    .line 5
    iget-object v1, p0, LO1/n$d;->b:LO1/n$b;

    .line 6
    .line 7
    invoke-static {v1}, LO1/n;->g(LO1/n$b;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {v0, v1}, LO1/n$a;->a(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
