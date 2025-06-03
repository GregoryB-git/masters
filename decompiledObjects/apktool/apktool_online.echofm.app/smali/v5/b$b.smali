.class public Lv5/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ly5/f;


# direct methods
.method public constructor <init>(Ly5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/b$b;->a:Ly5/f;

    return-void
.end method

.method public synthetic constructor <init>(Ly5/f;Lv5/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lv5/b$b;-><init>(Ly5/f;)V

    return-void
.end method
