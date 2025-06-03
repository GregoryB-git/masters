.class public interface abstract Lm0/N$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:Lm0/N$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/a0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm0/a0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lm0/a0$a;->h()Lm0/a0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm0/N$e;->a:Lm0/N$e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(IIIIIID)I
.end method
