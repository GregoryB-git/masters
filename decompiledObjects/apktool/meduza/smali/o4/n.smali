.class public interface abstract Lo4/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Lf;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf;

    invoke-direct {v0}, Lf;-><init>()V

    sput-object v0, Lo4/n;->l:Lf;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;ZZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lo4/l;",
            ">;"
        }
    .end annotation
.end method
