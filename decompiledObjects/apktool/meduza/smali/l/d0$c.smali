.class public final Ll/d0$c;
.super Ll/d0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Ll/d0;


# direct methods
.method public constructor <init>(Ll/d0;)V
    .locals 0

    iput-object p1, p0, Ll/d0$c;->b:Ll/d0;

    invoke-direct {p0, p1}, Ll/d0$b;-><init>(Ll/d0;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Ll/d0$c;->b:Ll/d0;

    invoke-static {v0, p1}, Ll/d0;->e(Ll/d0;I)V

    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Ll/d0$c;->b:Ll/d0;

    invoke-static {v0, p1}, Ll/d0;->d(Ll/d0;I)V

    return-void
.end method
