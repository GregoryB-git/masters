.class public final Ll/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Ll/a;


# direct methods
.method public constructor <init>(Ll/a;)V
    .locals 0

    iput-object p1, p0, Ll/a$a;->c:Ll/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll/a$a;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/a$a;->a:Z

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Ll/a$a;->c:Ll/a;

    invoke-static {v0}, Ll/a;->a(Ll/a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll/a$a;->a:Z

    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Ll/a$a;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll/a$a;->c:Ll/a;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/a;->f:Le0/o0;

    iget v1, p0, Ll/a$a;->b:I

    invoke-static {v0, v1}, Ll/a;->b(Ll/a;I)V

    return-void
.end method
