.class public interface abstract Ls0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Ls0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls0/a$c;

    .line 2
    .line 3
    invoke-direct {v0}, Ls0/a$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls0/c$a;->a:Ls0/c$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(Ld0/q;)I
.end method

.method public abstract b()Ls0/c;
.end method
